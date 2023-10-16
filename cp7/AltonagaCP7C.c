// Name: John Stanley T. Altonaga
// Date Created: 10/9/2023
// Date Finished: 10/12/2023
/* Description: This program is a BMI calculator implemented with stacks (singly-linked list).
The program can create a stack, add elements (at head), edit elements, delete elements, display top element, and display all elements.
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#include <stdbool.h>
#include <conio.h>

#define TEXTSIZE 50

typedef struct person *node;
struct person
{
    char firstName[TEXTSIZE];
    char lastName[TEXTSIZE];
    float weight;
    float height;
    float bmi;
    char category[TEXTSIZE];
    node next;
} Person;

void createQueue(node *queue, node *front, node *rear, bool *isChecked);
void enqueue(node *queue, node *front, node *rear, node data);
node dequeue(node *queue, node *front);
bool emptyQueue(node *queue);

int menu(void);
char *categoryBMI(float bmi);

void dataEntry(node *queue, node *front, node *rear);
// void dataEditByName(node *stack, node *top);
// void dataDeleteByName(node *stack, node *top);
void dataDisplay(node *queue, node *front, node *rear);

int main(void)
{
    node queue = NULL;
    node front = NULL;
    node rear = NULL;
    bool isChecked = false;

    int choice;
    do
    {
        choice = menu();
        switch (choice)
        {
        case 1:
            createQueue(&queue, &front, &rear, &isChecked);
            break;
        case 2:
            dataEntry(&queue, &front, &rear);
            break;
        case 3:
            // dataEditByName(&queue, &rear);
            break;
        case 4:
            // dataDeleteByName(&queue, &rear);
            break;
        case 5:
            dataDisplay(&queue, &front, &rear);
            break;
        case 6:
            printf("Exiting the program...\n");
        }
    } while (choice != 7);

    return 0;
}

/*  function to display menu and get choice
    @returns (int) choice
*/
int menu(void)
{
    int choice;
    do
    {
        system("cls");
        printf("BMI Calculator\n");
        printf("[1] Create Queue\n");
        printf("[2] Add element\n");
        printf("[3] Edit element\n");
        printf("[4] Delete element\n");
        printf("[5] Display all elements\n");
        printf("[6] Exit\n");

        printf("Enter choice: ");
        scanf("%d", &choice);

        if (choice < 1 || choice > 7)
        {
            printf("Invalid option. Please enter a valid option.\n");
            getch();
        }
    } while (choice < 1 || choice > 7);
    return choice;
}

/*  function to create queue
    @param (node *) queue
    @param (node *) front
    @param (node *) rear
    @param (bool *) isChecked
*/
void createQueue(node *queue, node *front, node *rear, bool *isChecked)
{
    // check if queue is already created
    if (*isChecked)
    {
        printf("Queue is already created. Press any key to continue.\n");
        getch();
        return;
    }

    // else, create queue
    *queue = NULL;
    *front = NULL;
    *rear = NULL;
    *isChecked = true;
    printf("Queue has been created. Press any key to continue.\n");
    getch();
    return;
}

/*  function to enqueue element to queue
    @param (node *) queue
    @param (node *) front
    @param (node *) rear
    @param (node) data
*/
void enqueue(node *queue, node *front, node *rear, node data)
{
    // insert at rear
    if (emptyQueue(queue))
    {
        *queue = data;
        *front = *queue;
        *rear = *queue;
        return;
    }

    (*rear)->next = data;
}

/*  function to dequeue element from queue
    @param (node *) queue
    @param (node *) front
    @param (node *) rear
    @returns (node) temp
*/
node dequeue(node *queue, node *front)
{
    // if queue is empty, return NULL
    if (emptyQueue(queue))
    {
        return NULL;
    }

    // else, return front
    node temp = *front;
    *front = (*front)->next;
    return temp;
}

/*  function to check if queue is empty
    @param (node *) queue
    @param (node *) front
    @param (node *) rear
    @returns (bool) isEmpty
*/
bool emptyQueue(node *queue)
{
    // if front is NULL, return true, else return false
    return *queue == NULL ? true : false;
}

/*  function to get data from user and push to stack
    @param (node *) top
*/
void dataEntry(node *queue, node *front, node *rear)
{
    node temp = malloc(sizeof(Person));
    // if malloc fails, exit program
    if (temp == NULL)
    {
        printf("Malloc failed. Exiting program...\n");
        exit(1);
    }

    char tempFirstName[TEXTSIZE];
    char tempLastName[TEXTSIZE];

    fflush(stdin); // clear input buffer
    system("cls");

    printf("Enter first name: ");
    fgets(tempFirstName, TEXTSIZE, stdin);
    tempFirstName[strcspn(tempFirstName, "\n")] = '\0'; // remove newline character
    strcpy(temp->firstName, tempFirstName);

    printf("Enter last name: ");
    fgets(tempLastName, TEXTSIZE, stdin);
    tempLastName[strcspn(tempLastName, "\n")] = '\0'; // remove newline character
    strcpy(temp->lastName, tempLastName);

    printf("Enter height (in cm): ");
    scanf("%f", &temp->height);

    printf("Enter weight (in lbs): ");
    scanf("%f", &temp->weight);

    temp->height /= 100;                                      // convert cm to m
    temp->weight *= 0.453592;                                 // convert lbs to kg
    temp->bmi = temp->weight / (temp->height * temp->height); // calculate bmi
    strcpy(temp->category, categoryBMI(temp->bmi));           // get category

    // push element to queue
    enqueue(queue, front, rear, temp);

    printf("\nData has been added. Press any key to continue.\n");
    getch();
    return;
}

/* function to get bmi category
    @param (float) bmi
    @returns (string) category
 */
char *categoryBMI(float bmi)
{
    if (bmi < 18.5)
    {
        return "Underweight";
    }
    else if (bmi >= 18.5 && bmi <= 24.9)
    {
        return "Normal";
    }
    else if (bmi >= 25 && bmi <= 29.9)
    {
        return "Overweight";
    }
    else if (bmi >= 30)
    {
        return "Obese";
    }
}

/*  function to edit element in stack
    @param (node *) top
*/
// void dataEditByName(node *stack, node *top)
// {
//     // check if stack is empty
//     if (isEmpty(top))
//     {
//         printf("Stack is empty. Press any key to continue.\n");
//         getch();
//         return;
//     }

//     char tempFirstName[TEXTSIZE];
//     char tempLastName[TEXTSIZE];

//     fflush(stdin); // clear input buffer
//     system("cls");

//     printf("Enter first name: ");
//     fgets(tempFirstName, TEXTSIZE, stdin);
//     tempFirstName[strcspn(tempFirstName, "\n")] = '\0'; // remove newline character

//     printf("Enter last name: ");
//     fgets(tempLastName, TEXTSIZE, stdin);
//     tempLastName[strcspn(tempLastName, "\n")] = '\0'; // remove newline character

//     node t = *top; // temp node to hold top
//     node tempStack = NULL;
//     node tempTop = NULL;  // temp stack top holder
//     bool isFound = false; // flag to check if data is found

//     // pop element, display returned element from pop, then push element to a temp stack
//     while (t != NULL)
//     {
//         node temp = pop(stack, &t);
//         if (stricmp(temp->firstName, tempFirstName) == 0 && stricmp(temp->lastName, tempLastName) == 0)
//         {
//             isFound = true;
//             // display element
//             system("cls");
//             printf("Record found. Displaying record...\n");
//             printf("\n%-20s%-20s%-20s%-20s%-20s%-20s\n", "First Name", "Last Name", "Height (m)", "Weight (kg)", "BMI", "BMI Category");
//             printf("%-20s%-20s%-20.2f%-20.2f%-20.2f%-20s\n", strupr(temp->firstName), strupr(temp->lastName), temp->height, temp->weight, temp->bmi, temp->category);

//             char choice;
//             printf("\nDo you want to edit this record? (y/n): ");

//             do
//             {
//                 scanf(" %c", &choice);
//                 choice = tolower(choice);
//                 if (choice != 'y' && choice != 'n')
//                 {
//                     printf("Invalid option. Please enter a valid option.\n");
//                 }
//                 if (choice == 'y')
//                 {
//                     // get new data
//                     printf("\nEnter new height (in cm): ");
//                     scanf("%f", &temp->height);

//                     printf("Enter new weight (in lbs): ");
//                     scanf("%f", &temp->weight);

//                     temp->height /= 100;                                      // convert cm to m
//                     temp->weight *= 0.453592;                                 // convert lbs to kg
//                     temp->bmi = temp->weight / (temp->height * temp->height); // calculate bmi
//                     strcpy(temp->category, categoryBMI(temp->bmi));           // get category

//                     // push element back to stack
//                     push(stack, &t, temp);
//                     printf("\nData has been edited. Press any key to continue.\n");
//                     getch();
//                     break;
//                 }
//                 if (choice == 'n')
//                 {
//                     // push element back to stack
//                     push(stack, &t, temp);
//                     printf("\nData has not been edited. Press any key to continue.\n");
//                     getch();
//                     break;
//                 }
//             } while (choice != 'y' && choice != 'n');

//             break; // since data is found, break out of loop
//         }
//         // if data does not match, push element to temp stack
//         push(&tempStack, &tempTop, temp);
//     }

//     // push elements back to original stack
//     while (tempStack != NULL)
//     {
//         node temp = pop(&tempStack, &tempTop);
//         push(stack, &t, temp);
//     }

//     // if data is not found, display message
//     if (!isFound)
//     {
//         printf("\nData not found. Press any key to continue.\n");
//         getch();
//         return;
//     }

//     *top = t; // update top
//     *stack = *top;
//     return;
// }

/*  function to delete element from stack
    @param (node *) top
*/
// void dataDeleteByName(node *stack, node *top)
// {
//     // check if stack is empty
//     if (isEmpty(top))
//     {
//         printf("Stack is empty. Press any key to continue.\n");
//         getch();
//         return;
//     }

//     char tempFirstName[TEXTSIZE];
//     char tempLastName[TEXTSIZE];

//     fflush(stdin); // clear input buffer
//     system("cls");

//     printf("Enter first name: ");
//     fgets(tempFirstName, TEXTSIZE, stdin);
//     tempFirstName[strcspn(tempFirstName, "\n")] = '\0'; // remove newline character

//     printf("Enter last name: ");
//     fgets(tempLastName, TEXTSIZE, stdin);
//     tempLastName[strcspn(tempLastName, "\n")] = '\0'; // remove newline character

//     node t = *top; // temp node to hold top
//     node tempStack = NULL;
//     node tempTop = NULL;  // temp stack top holder
//     bool isFound = false; // flag to check if data is found

//     // pop element, display returned element from pop, then push element to a temp stack
//     while (t != NULL)
//     {
//         node temp = pop(stack, &t);
//         if (stricmp(temp->firstName, tempFirstName) == 0 && stricmp(temp->lastName, tempLastName) == 0)
//         {
//             isFound = true;

//             // display element
//             system("cls");
//             printf("Record found. Displaying record...\n");
//             printf("\n%-20s%-20s%-20s%-20s%-20s%-20s\n", "First Name", "Last Name", "Height (m)", "Weight (kg)", "BMI", "BMI Category");
//             printf("%-20s%-20s%-20.2f%-20.2f%-20.2f%-20s\n", strupr(temp->firstName), strupr(temp->lastName), temp->height, temp->weight, temp->bmi, temp->category);
//             char choice;
//             printf("\nDo you want to delete this record? (y/n): ");

//             do
//             {
//                 scanf(" %c", &choice);
//                 choice = tolower(choice);
//                 if (choice != 'y' && choice != 'n')
//                 {
//                     printf("Invalid option. Please enter a valid option.\n");
//                 }
//                 if (choice == 'y')
//                 {

//                     printf("\nData has been deleted. Press any key to continue.\n");
//                     getch();
//                     break;
//                 }
//                 if (choice == 'n')
//                 {
//                     // push element back to stack
//                     push(stack, &t, temp);
//                     printf("\nData has not been deleted. Press any key to continue.\n");
//                     getch();
//                     break;
//                 }
//             } while (choice != 'y' && choice != 'n');

//             break; // since data is found, break out of loop
//         }
//         // if data does not match, push element to temp stack
//         push(&tempStack, &tempTop, temp);
//     }

//     // push elements back to original stack
//     while (tempStack != NULL)
//     {
//         node temp = pop(&tempStack, &tempTop);
//         push(stack, &t, temp);
//     }

//     // if data is not found, display message
//     if (!isFound)
//     {
//         printf("\nData not found. Press any key to continue.\n");
//         getch();
//         return;
//     }

//     *top = t; // update top
//     *stack = *top;
//     return;
// }

/*  function to display all elements in stack
    @param (node *) top
*/
void dataDisplay(node *queue, node *front, node *rear)
{
    // check if queue is empty
    if (emptyQueue(queue))
    {
        printf("Queue is empty. Press any key to continue.\n");
        getch();
        return;
    }

    // else, display all elements
    node t = *front; // temp node to hold front

    // temp queue
    node tempQueue = NULL;
    node tempFront = NULL;
    node tempRear = NULL;

    system("cls");

    printf("\n%-20s%-20s%-20s%-20s%-20s%-20s\n", "First Name", "Last Name", "Height (m)", "Weight (kg)", "BMI", "BMI Category");

    while (t != NULL)
    {
        node temp = dequeue(queue, front);
        printf("%-20s%-20s%-20.2f%-20.2f%-20.2f%-20s\n", strupr(temp->firstName), strupr(temp->lastName), temp->height, temp->weight, temp->bmi, temp->category);
        printf("yo");
        enqueue(&tempQueue, &tempFront, &tempRear, temp);
    }

    printf("yo");

    // enqueue elements back to original queue
    while (tempQueue != NULL)
    {
        node temp = dequeue(&tempQueue, &tempFront);
        enqueue(queue, front, rear, temp);
    }

    printf("\nPress any key to continue.\n");
    getch();
    return;
}
