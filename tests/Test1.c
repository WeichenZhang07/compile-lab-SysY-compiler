int main() {
    int a, b, c = 1, d;
    int result;
    a = 5;
    b = 5;
    d = -2;
    result = 2;
    if (a + b == 9 || a - b == 0 && result != 4)
        result = result + 3;
    else if (c + d != -1 || (result + 1) % 2 == 1)
        result = result + 4;
    putint(result);
    return 0;
}