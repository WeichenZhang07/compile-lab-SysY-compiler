int main() {
    int a = getint();
    {
        int b = 2;
        putint(a + b);
        int a = getint();
        putint(a + b);
    }
    int b = a + 2;
    putint(a + b);
    return 0;
}