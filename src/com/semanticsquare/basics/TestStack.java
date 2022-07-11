class Stack{
int[] st=new int[10];
int tos;
Stack(){
tos=-1;
}
void push(int value){
if(tos==10)
{
System.out.println("Stack is full");
}
else
{
st[++tos]=value;
}
}
int pop(){
if(tos<0){
System.out.println("Stack is underflow");
return 0;
}
else{
return st[tos--];
}
}
}
public class TestStack{
public static void main(String[] args){
Stack stack1 = new Stack();
Stack stack2 = new Stack();
for(int i=0;i<10;i++)
{
stack1.push(i);
}
for(int i=10;i<20;i++)
{
stack2.push(i);
}
for(int i=0;i<10;i++)
{
System.out.println(stack1.pop());
}
for(int i=0;i<10;i++)
{
System.out.println(stack2.pop());
	}}
}