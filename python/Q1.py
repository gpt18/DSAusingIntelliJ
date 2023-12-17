class TrieNode:
    def __init__(self):
        self.children = [None] * 26
        self.isEnd = False
    
    def insert(self, root, key):
        curNode = root
        
        for i in range(len(key)):
            cur = key[i]
            index = ord(cur) - ord('a')
            if curNode.children[index] == None :
                newNode = TrieNode()
                curNode.children[index] = newNode
            curNode = curNode.children[index]

        curNode.isEnd = True

    def search(self, root, key):
        curNode = root

        for i in range(len(key)):
            cur = key[i]
            index = ord(cur) - ord('a')
            if curNode.children[index] == None :
                return False
            curNode = curNode.children[index]
        
        return curNode.isEnd


trie = TrieNode()
trie.insert(trie, 'guddu')
trie.insert(trie, 'hello')
trie.insert(trie, 'world')
username = input("Search username: ")
print('Username already taken' if trie.search(trie, username) else 'Username Available')

