class TrieNode {
    // Initialize the map inside the constructor to avoid NullPointerExceptions
    HashMap<Character, TrieNode> children;
    boolean isWord;

    public TrieNode() {
        children = new HashMap<>();
        isWord = false;
    }
}

class WordDictionary {
    private TrieNode root;

    public WordDictionary() {
        root = new TrieNode(); 
    }

    // Adds a word into the data structure.
    public void addWord(String word) {
        TrieNode cur = root;
        for (char c : word.toCharArray()) {
            // If character doesn't exist, put a new TrieNode
            cur.children.putIfAbsent(c, new TrieNode());
            // Move our pointer to the child node
            cur = cur.children.get(c); 
        }
        // Mark the end of the word
        cur.isWord = true;
    }

    // Returns true if the word is in the data structure (handles '.')
    public boolean search(String word) {
        return dfs(word, 0, root);
    }

    private boolean dfs(String word, int index, TrieNode cur) {
        // Base Case: If we have matched all characters, check if it forms a valid word
        if (index == word.length()) {
            return cur.isWord;
        }

        char c = word.charAt(index);

        if (c == '.') {
            // Wildcard match: Try ALL possible children branches at this level
            for (TrieNode child : cur.children.values()) {
                if (dfs(word, index + 1, child)) {
                    return true; // Found a match down this path!
                }
            }
            return false; // None of the paths matched
        } else {
            // Exact match: Check if character exists in current node's children
            if (!cur.children.containsKey(c)) {
                return false;
            }
            // Move deeper into the tree and check the next character
            return dfs(word, index + 1, cur.children.get(c));
        }
    }
}