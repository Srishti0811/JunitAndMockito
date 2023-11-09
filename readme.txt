Why need Junit?

To test basic modules - methods and class individually.

Why Mockito?

If we have another service and API that is implementing our method, we would need to call the service
and run through that method as well which is not needed as its already tested. 
This could be an existing API or Cloud method so no point testing again.

Mockito helps create a mock of that service. We need to know the output that the service would return to go get the result of the 
main method we are testing.



https://www.youtube.com/watch?v=eILy4p99ac8&list=TLPQMDgxMTIwMjO1MMg9he8jgw&index=1