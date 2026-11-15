class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        returns = []

        for i in range(len(temperatures)):
            current_temp = temperatures[i]
            days_to_wait = 0

            for j in range(i+1, len(temperatures)):
                compare_temp = temperatures[j]

                if compare_temp > current_temp:
                    days_to_wait = j - i
                    break
            
            returns.append(days_to_wait)
        return returns

                