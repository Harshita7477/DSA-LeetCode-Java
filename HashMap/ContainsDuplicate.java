import java.util.HashSet;

class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int n : nums) {
            if (set.contains(n)) {
                return true;
            }
            set.add(n);
        }

        return false;
    }

    public static void main(String[] args) {

        ContainsDuplicate obj = new ContainsDuplicate();

        int[] nums = {1, 2, 3, 4, 1};

        System.out.println(obj.containsDuplicate(nums));
    }
}