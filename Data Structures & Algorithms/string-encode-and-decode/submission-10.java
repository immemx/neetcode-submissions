class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        strs.forEach(string -> {
            sb.append(string.length()).append(",");
        });
        sb.append("#");
        strs.forEach(string -> {
            sb.append(string);
        });
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();

        int i = 0;
        while (str.charAt(i) != '#') {
            StringBuilder curr = new StringBuilder();

            while (str.charAt(i) != ',') {
                curr.append(str.charAt(i));
                i++;
            }
            
            sizes.add(Integer.parseInt(curr.toString()));
            i++;
        }

        i++;

        for (int sz : sizes) {
            res.add(str.substring(i, i + sz));
            i += sz;
        }
        return res;
    }
}
