#include <iostream>
#include <string>
#include <vector>
#include "tree/Tree.h"
#include "./lw29/LW29.h"

void quicksort(int randL, int randR, int **arr)
{
    int i = randL;
    int j = randR;
    int pivot = arr[0][randL];
    do
    {
        while (arr[0][i] <= pivot && i < pivot)
        {
            i++;
        }
        while (i < j && i < randR && randL < j)
        {
            j--;
        }
    } while (i < j);
    if (arr[0][i] > pivot)
    {
        int tmp = pivot;
        arr[0][randR] = arr[0][i];
        arr[0][i] = tmp;
        i++;
    }
    else
    {
        j--;
    }
    quicksort(randL, j, arr);
    quicksort(i, randR, arr);
}

int main()
{
    Tree<Ahne> *ahnenBaum = new Tree<Ahne>(Ahne("Lisa", "Simpson", 'w'));
    ane::ausgabe(ahnenBaum);
    int arr[] = {15, 3, 86, 45, 13, 7, 95, 88, 2};
    int *pArr = arr;
    quicksort(0, 0, &pArr);
    return 0;
}