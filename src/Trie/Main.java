public class Main {
    public static void main(String[] args) {
       

        TrieNode trie = new TrieNode();
        trie.insert(trie, "hello");
        trie.insert(trie, "hello");
        trie.insert(trie, "guddugudduguddugudduguddugudduguddugudduguddugudduguddugudduguddu");
        trie.insert(trie, "hello");

        String username = "guddugudduguddugudduguddugudduguddugudduguddugudduguddugudduguddu";
        System.out.println(username);
        System.out.println(
            trie.search(trie, username) ?
            "Username already taken" :
            "Username Available"
        );
    
    }


}

class TrieNode {
    TrieNode[] children;
    boolean isEnd;

    TrieNode(){
        children = new TrieNode[26];
        isEnd = false;

        for(int i = 0; i < children.length; i++) {
            children[i] = null;
        }
    }

    void insert(TrieNode root, String key) {
        TrieNode curNode = root;
        for(int i = 0; i < key.length(); i++){
            char cur = key.charAt(i);
            if(curNode.children[cur - 'a'] == null) {
                TrieNode newNode = new TrieNode();
                curNode.children[cur - 'a'] = newNode;
            }
            curNode = curNode.children[cur - 'a'];
        }

        curNode.isEnd = true;
    }

    boolean search(TrieNode root, String key){
        TrieNode curNode = root;
        for(int i = 0; i < key.length(); i++) {
            char cur = key.charAt(i);
            if(curNode.children[cur - 'a'] == null) return false;
            curNode = curNode.children[cur - 'a'];
        }

        return curNode.isEnd;
    }
}