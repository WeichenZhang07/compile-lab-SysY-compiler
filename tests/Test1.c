int main() {
    int n    = getint();
    int ch_A = 65, ch_C = 67, ch_W = 87, newline = 10;

    if (1 > 2) {
        while (1 == 1)
            ;
    }

    if (1 < 2) {
        int i = 1;
        while (i < n) {
            putch(((ch_A)));
            putch(67);
            putch(newline);
            i = i + 1;
        }
    } else {
        int i = 1;
        while (i < n) {
            putch(ch_W);
            putch((ch_A));
            putch(newline);
        }
    }

    int i = 1;
    while (i <= n) {
        putch(ch_A);
        putch((ch_C));
        i = i + 1;
    }

    return 0;
}