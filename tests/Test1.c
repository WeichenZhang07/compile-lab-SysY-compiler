int func1() {
    return 555;
}

int func2() {
    return 111;
}

int main() {
    int a = func1();
    putint(a - func2());
    return 0;
}