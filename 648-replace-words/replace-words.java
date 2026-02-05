class Solution {
    static class Trie {
        class Node {
            char ch;
            String isTerminal; 
            HashMap<Character, Node> child;
            Node(char ch) {
                this.ch = ch;
                this.child = new HashMap<>();
                this.isTerminal = null;
            }
        }
        private Node root = new Node('*');
        public void insert(String word) {
            Node curr = root;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (curr.child.containsKey(ch)) {
                    curr = curr.child.get(ch);
                } else {
                    Node nn = new Node(ch);
                    curr.child.put(ch, nn);
                    curr = nn;
                }
            }
            curr.isTerminal = word;
        }
        public String search(String word) {
            Node curr = root;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (curr.child.containsKey(ch)) {
                    curr = curr.child.get(ch);
                    if (curr.isTerminal != null) {
                        return curr.isTerminal;
                    }
                } else {
                    return word;
                }
            }
            return word;
        }
    }
    public String replaceWords(List<String> dict, String sentence) {
        Trie t = new Trie();
        for (String w : dict) {
            t.insert(w);
        }
        String[] arr = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(t.search(s)).append(" ");
        }
        return sb.toString().trim();
    }
}
