package top.tntok.autobot;

/* renamed from: top.tntok.autobot.o0OOo0O0  reason: case insensitive filesystem */
public enum C0376o0OOo0O0 implements C0231o00oOOo {
    SWITCH_PROTOCOL(iilLil1i11I1.iLIIl1IliLlLI, "Switching Protocols"),
    OK(200, "OK"),
    CREATED(201, "Created"),
    ACCEPTED(202, "Accepted"),
    NO_CONTENT(204, "No Content"),
    PARTIAL_CONTENT(206, "Partial Content"),
    MULTI_STATUS(207, "Multi-Status"),
    REDIRECT(301, "Moved Permanently"),
    FOUND(302, "Found"),
    REDIRECT_SEE_OTHER(303, "See Other"),
    NOT_MODIFIED(304, "Not Modified"),
    TEMPORARY_REDIRECT(C0375o0OOo0O.il1LilLllii, "Temporary Redirect"),
    BAD_REQUEST(400, "Bad Request"),
    UNAUTHORIZED(401, "Unauthorized"),
    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND(404, "Not Found"),
    METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
    NOT_ACCEPTABLE(406, "Not Acceptable"),
    REQUEST_TIMEOUT(408, "Request Timeout"),
    CONFLICT(409, "Conflict"),
    GONE(410, "Gone"),
    LENGTH_REQUIRED(411, "Length Required"),
    PRECONDITION_FAILED(412, "Precondition Failed"),
    PAYLOAD_TOO_LARGE(413, "Payload Too Large"),
    UNSUPPORTED_MEDIA_TYPE(415, "Unsupported Media Type"),
    RANGE_NOT_SATISFIABLE(416, "Requested Range Not Satisfiable"),
    EXPECTATION_FAILED(417, "Expectation Failed"),
    TOO_MANY_REQUESTS(429, "Too Many Requests"),
    INTERNAL_ERROR(500, "Internal Server Error"),
    NOT_IMPLEMENTED(501, "Not Implemented"),
    SERVICE_UNAVAILABLE(503, "Service Unavailable"),
    UNSUPPORTED_HTTP_VERSION(505, "HTTP Version Not Supported");
    
    private final String description;
    private final int requestStatus;

    /* access modifiers changed from: public */
    C0376o0OOo0O0(int i, String str) {
        this.requestStatus = i;
        this.description = str;
    }

    public static C0376o0OOo0O0 il1LilLllii(int i) {
        for (C0376o0OOo0O0 o0ooo0o0 : values()) {
            if (o0ooo0o0.i1LIL11l() == i) {
                return o0ooo0o0;
            }
        }
        return null;
    }

    public int i1LIL11l() {
        return this.requestStatus;
    }

    public String iiI1L1iI() {
        return "" + this.requestStatus + " " + this.description;
    }
}
