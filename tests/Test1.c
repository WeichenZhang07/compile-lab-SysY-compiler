int main() {
    const int ch = 48;
    int i = 1;
    while (i < 12) {
        int j = 0;
        while (1 == 1) {
            if (j % 3 == 1) {
                putch(ch + 1);
            } else {
                putch(ch);
            }
            j = j + 1;
            if (j >= 2 * i - 1)
                break;
        }
        putch(10);
        i = i + 1;
        continue; // something meaningless
    }
    return 0;
}