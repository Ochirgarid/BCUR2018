#include <stdio.h>

int main(int argc, char* argv[]) {
  char line[256];
  
  // char const* const fileName = argv[1];
  char const* const fileName = "../data.in";
  
  FILE* file = fopen(fileName, "r");
  while (fgets(line, sizeof(line), file))
    printf("%s", line);


  fclose(file);
  return 0;
}