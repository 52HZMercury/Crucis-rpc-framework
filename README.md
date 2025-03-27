# Crucis-rpc-framework

## Preface

Currently, only the most basic functions of the RPC framework have been implemented.

## Introduction

It is an RPC framework implemented based on Netty + Kyro + Zookeeper.

### Architecture of this RPC Project

The following diagram illustrates the structure of this framework:

[//]: # (![]&#40;./images/rpc-architure.png&#41;)

The Server (service provider) registers services with the registry center. The Client (service consumer) retrieves service-related information from the registry center and then makes a network request to the Server.

[//]: # (![]&#40;./images/rpc-architure-detail.png&#41;)

### Basic Information about the Project

- Uses Netty for network transmission;
- Implements Netty heartbeat mechanism: Ensures that the connection between the client and server is not interrupted, avoiding reconnections.
- Utilizes the open-source serialization mechanism Kryo instead of the JDK's built-in serialization mechanism.
- Employs Zookeeper as the registry center to manage service address information.
- Uses the JDK's built-in dynamic proxy to shield the details of remote method invocation.
- Implements load balancing when the client calls remote services to avoid a single server responding to the same request, preventing server crashes or breakdowns.
- Integrates with Spring to register services and consume services through annotations.
