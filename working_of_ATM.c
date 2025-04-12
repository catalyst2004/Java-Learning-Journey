#include<stdio.h>
#include<conio.h>
#define n 10
int main(){
    int selection,i;
    float amount = 25000;
    float w_amount,r_balance,deposit;
    //Introduction interface message
    printf("Welcome to Punjab National Bank!!\n");
    printf("Select any one from the following options:\n <1.Withdrawal>\t <2.Check Balance>\t <3.Deposit>\t <4.Exit>\n");
    for(i=0;i<n;i++){
                     printf("***");
                     }
    printf(" ");                 
    printf("\nEnter your selection:");
    scanf("%d",&selection);
    if(selection ==1){
        printf("You have selected Option 1: Withdrawal\n");
        printf("Enter your withdrawal amount:");
        scanf("%f",&w_amount);
        r_balance = amount - w_amount;
        if(w_amount>amount){
                            printf("Not sufficient balance!!");
                            }
        else{                    
             printf("Your Remaining balance is:Rs.%f",r_balance);
             }
    }
    if(selection==2){
         printf("You have selected Option 2:Check Balance\n");
         printf("Your Balance is:Rs.%f\t",amount);
         }
    if(selection==3){
            printf("\nYou have selected option 3:Deposit\n");
            for(i=0;i<n;i++){
                     printf("***");
                     }
            printf("Enter the amount you want to deposit:Rs.\t");
            scanf("%f",&deposit);  
            r_balance=amount + deposit;
            printf("New balance is:(Rs.)%f\t",r_balance);
            }       
      if(selection==4){
                      printf("Thankyou for using our Service!!");
                      printf("Have a good day");
                      }                                  
    getch();
    return 0;
}
