# Sample Spring application with JIB

[Jib](https://github.com/GoogleContainerTools/jib#readme) is a tool to create a docker image with your application, in a optimized way, without any Dockerfile or rebuilding the layers. Here I use it as maven plugin

## Create the image

You can containerize the application with one of the following commands.

```shell
mvn package
```
