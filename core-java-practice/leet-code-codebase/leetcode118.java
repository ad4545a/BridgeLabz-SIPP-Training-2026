import java.util.ArrayList;
import java.util.List;

class Leetcode118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        list.add(arr);

        if (numRows == 1) {
            return list;
        }

        int cnt = 0;
        int j = numRows - 1;
        while (j-- > 0) {
            List<Integer> inner = list.get(cnt);
            List<Integer> element = new ArrayList<>();
            for (int i = 0; i <= inner.size(); i++) {
                if (i == 0 || i == inner.size()) {
                    element.add(1);
                } else {
                    element.add(inner.get(i) + inner.get(i - 1));
                }
            }
            list.add(element);
            cnt++;
        }

        return list;
    }

    public static void main(String[] args) {
        Leetcode118 solution = new Leetcode118();
        int numRows = 5;
        List<List<Integer>> triangle = solution.generate(numRows);

        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}