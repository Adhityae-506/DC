// You must implement the function swapChildren which accepts two arguments:

// root: a pointer to the root node of a binary tree.

// X: an integer value.

// The function must find the node with value X in the binary tree.
// If the node has two children, swap the left and right child.
// If the node has less than two children, do not modify anything.
// The function must not modify any other part of the tree.

// Tree Structure:
// struct Node {
//     int data;
//     struct Node *left, *right;
// };
// Input Format:

// First line: N — number of nodes.

// Next N lines: Each line: value of parent, value of child, side (L or R).

// Last line: value X.

// Output:

// First line: pre-order traversal before swap.

// Second line: pre-order traversal after swap.

// Example Input 1:
// 10
// 30 10 L
// 30 50 R
// 10 5 L
// 10 20 R
// 50 40 L
// 50 70 R
// 20 15 L
// 20 25 R
// 70 60 L
// 70 90 R
// 20
// Expected Output:
// 30 10 5 20 15 25 50 40 70 60 90
// 30 10 5 20 25 15 50 40 70 60 90

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct Node {
    int data;
    struct Node *left, *right;
};

struct Node* newNode(int data) {
    struct Node* node = (struct Node*)malloc(sizeof(struct Node));
    node->data = data;
    node->left = node->right = NULL;
    return node;
}

void insert(struct Node* root, int parent, int child, char dir) {
    if (root == NULL) return;

    if (root->data == parent) {
        if (dir == 'L') root->left = newNode(child);
        else root->right = newNode(child);
    } else {
        insert(root->left, parent, child, dir);
        insert(root->right, parent, child, dir);
    }
}

void preorder(struct Node* root) {
    if (root == NULL) return;
    printf("%d ", root->data);
    preorder(root->left);
    preorder(root->right);
}

void swapChildren(struct Node* root, int X) {
    if (root == NULL) return;
    if (root->data == X) {
        if (root->left && root->right) {
            struct Node* temp = root->left;
            root->left = root->right;
            root->right = temp;
        }
    } else {
        swapChildren(root->left, X);
        swapChildren(root->right, X);
    }
}

int main() {
    int N;
    scanf("%d", &N);

    int parent, child;
    char dir;
    scanf("%d %d %c", &parent, &child, &dir);

    struct Node* root = newNode(parent);
    insert(root, parent, child, dir);

    for (int i = 1; i < N; i++) {
        scanf("%d %d %c", &parent, &child, &dir);
        insert(root, parent, child, dir);
    }

    int X;
    scanf("%d", &X);

    preorder(root);
    printf("\n");
    swapChildren(root, X);
    preorder(root);
    printf("\n");

    return 0;
}
