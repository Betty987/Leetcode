class Solution(object):
    def isPrefixOfWord(self, sentence, searchWord):
        """
        :type sentence: str
        :type searchWord: str
        :rtype: int
        """
        for i,word in enumerate(sentence.split()):
            if(word.startswith(searchWord)):
                return i+1
        return -1
        