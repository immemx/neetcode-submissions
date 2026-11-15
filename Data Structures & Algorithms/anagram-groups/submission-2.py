class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagramTracker = {}

        for word in strs:
            key = ''.join(sorted(word))

            if key in anagramTracker:
                anagramTracker[key].append(word)
            else:
                anagramTracker[key] = [word]

        return list(anagramTracker.values())