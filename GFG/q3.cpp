#include <iostream>
#include <string>

using namespace std;

int main() {
  string str;
  cin >> str;

  for (int i = 0; i < str.length(); i++) {
    if (str[i] == 'A' || str[i] == 'E' || str[i] == 'I' || str[i] == 'O' ||
        str[i] == 'U') {
      if (i >= 5) {
        str.replace(i, 1, "_");
        i += 4; // Skip the added underscores
      }
    } else if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' ||
               str[i] == 'u') {
      if (i >= 5) {
        str.replace(i, 1, "_");
        i += 4; // Skip the added underscores
      }
    }
  }
  cout << str;
  return 0;
}