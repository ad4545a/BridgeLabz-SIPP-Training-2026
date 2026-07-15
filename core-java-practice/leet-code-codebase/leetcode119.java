import java.util.ArrayList;
import java.util.List;

class Leetcode119 {
    public List<Integer> getRow(int rowIndex) {
        int rows = rowIndex;
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        list.add(arr);

        if (rowIndex == 0) {
            return list.get(0);
        }

        int cnt = 0;
        while (rows-- > 0) {
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

        return list.get(rowIndex);
    }

    public static void main(String[] args) {
        Leetcode119 solution = new Leetcode119();
        int rowIndex = 5;
        List<Integer> row = solution.getRow(rowIndex);
        System.out.println(row);
    }
}