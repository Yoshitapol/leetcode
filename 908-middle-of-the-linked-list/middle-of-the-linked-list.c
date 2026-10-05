/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* middleNode(struct ListNode* head) {
    struct ListNode* node=head;
    int count=0,i;
    while(node!=NULL){
        node=node->next;
        count++;
    }
    node=head;
    for(i=0;i<count/2;i++)
        node=node->next;
    return node;
}