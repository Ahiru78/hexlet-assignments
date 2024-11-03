package exercise;

import io.javalin.Javalin;

public final class App {

    public static Javalin getApp() {

        // BEGIN
        var app = Javalin.create(config -> {
			config.bundledPlugins.enableDevLogging();
        });
        app.get("/users", ctx -> ctx.messageAsClass("GET /phones"));
        app.get("/users", ctx -> ctx.messageAsClass("GET /domains"));
		return app;
        // END
    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
