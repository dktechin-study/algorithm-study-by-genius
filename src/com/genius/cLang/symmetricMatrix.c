#include <stdio.h>
char tmpChar[2];
char initMatrix[128];

int main(void) {
    int tc;
    int i, j;
    int testCases;
    int num_Matrix;
    
    freopen("symmetricMatrix.txt", "r", stdin);

    scanf("%d", &testCases);
    
    for(tc = 0; tc < testCases; tc++) {
        scanf("%d", &num_Matrix);        
	for(i = 0; i < num_Matrix; i++) {
            scanf("%s", &initMatrix[i]);
        }
        for(i = 0; i < num_Matrix; i++) {
            for(j=0; j < num_Matrix; j++) {
                char c = initMatrix[i ^ j];
		if(j == num_Matrix -1)
                    printf("%c\n", c);
                else 
                    printf("%c", c);
            }
        }
        printf("\n");
    }

    return 0;	
}
