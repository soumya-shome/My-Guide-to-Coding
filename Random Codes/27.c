#include <stdio.h>
#include <windows.h>

int main()
{
  unsigned char b,f;

  for (b=0;b<16;b++)
  {
    for (f=0;f<16;f++)
    {
        SetConsoleTextAttribute (GetStdHandle(STD_OUTPUT_HANDLE), 0 | f);
        printf ("%.2X", 0 | f);
    }
    printf ("\n");
  }
  SetConsoleTextAttribute (GetStdHandle(STD_OUTPUT_HANDLE), 0x07);
  printf ("\n");
  return 0;
}
