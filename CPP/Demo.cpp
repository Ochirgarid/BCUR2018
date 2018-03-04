#include <iostream>
#include <fstream>

using namespace std;

ifstream fin("../data.in");
ofstream fout("data.out");

int main() {
  int a;
  while (fin >> a) {
    printf("%d \n", a);
  }

  return 0;
}