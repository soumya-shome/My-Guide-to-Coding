#include <stdio.h>

int main() {
    int i, t1 = 0, t2 = 1, n;

   for (i = 1; i <= 6; ++i) {
        printf("%d, ", t1);

        n = t1 + t2;

        t1 = t2;

        t2 = n;

    }



    return 0;

}
