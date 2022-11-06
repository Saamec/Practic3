import java.util.Arrays;

public class MergeSort {
    public void SortUnsorted(int[] a, int first, int last) {

        if (last <= first)
            return;
        int mid = first + (last - first) / 2;
        SortUnsorted(a, first, mid);
        SortUnsorted(a, mid + 1, last);

        int[] buf = Arrays.copyOf(a, a.length);

        for (int k = first; k <= last; k++)
            buf[k] = a[k];

        int i = first, j = mid + 1;
        for (int k = first; k <= last; k++) {

            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > last) {
                a[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }
    }
}
