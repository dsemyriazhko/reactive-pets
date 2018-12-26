## Key interfaces
- Publisher
- Subscriber
- Subscription
- Processor

## Benefits of reaction

Reactive - programming model that facilitates scalability and stability by creating event-driven non-blocking functional pipelines that react to availability and processability of resources

Drastically reduces the number of required native threads!

## DB Frameworks

- Oracle - ADBA / community - Postgres ADBA driver
- Pivotal - R2DBC (on 15.12.2018 https://github.com/spring-projects/spring-data-r2dbc )
    * PostgreSQL
    * H2
    * Microsoft SQL Server
- JDBC on Fibers - stack switching as soon as an invocation hits a blocking API (game changer).

## Conclusion

It's really hard to support & debug reactive application now.

Best you can do now with reactive things: 
- observe progress
- play with pet projects

_P.S. It's not ready for production purposes._