import org.apache.camel.builder.RouteBuilder;

public class MyRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:tick")
            .setBody().constant("hello")
            .to("direct:log");
            
        from("direct:log")
            .log("${body}");
    }
}