class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        pair = [[p, s] for p, s in zip(position, speed)]
        stack = []

        for p, s in sorted(pair)[::-1]:
            calc = ((target - p) / s) 
            if stack and calc <= stack[-1]:
                continue
            else: 
                stack.append(calc)
        return len(stack)

        