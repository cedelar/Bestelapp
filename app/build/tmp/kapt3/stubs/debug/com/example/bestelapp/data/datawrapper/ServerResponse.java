package com.example.bestelapp.data.datawrapper;

import java.lang.System;

/**
 * Moshi Json convertable data class used to wrap the response from a Post requests from the server.
 *
 * @property status A [String] with the return status ("OK" or "NOK")
 * @property reason If status "NOK": A [String] with the reason for the failed order
 * @constructor Creates a [ServerResponse].
 * @author Cedric Delaruelle
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/example/bestelapp/data/datawrapper/ServerResponse;", "", "status", "", "reason", "(Ljava/lang/String;Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "getStatus", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class ServerResponse {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String status = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String reason = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReason() {
        return null;
    }
    
    public ServerResponse(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "status")
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "reason")
    java.lang.String reason) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * Moshi Json convertable data class used to wrap the response from a Post requests from the server.
     *
     * @property status A [String] with the return status ("OK" or "NOK")
     * @property reason If status "NOK": A [String] with the reason for the failed order
     * @constructor Creates a [ServerResponse].
     * @author Cedric Delaruelle
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.bestelapp.data.datawrapper.ServerResponse copy(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "status")
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "reason")
    java.lang.String reason) {
        return null;
    }
    
    /**
     * Moshi Json convertable data class used to wrap the response from a Post requests from the server.
     *
     * @property status A [String] with the return status ("OK" or "NOK")
     * @property reason If status "NOK": A [String] with the reason for the failed order
     * @constructor Creates a [ServerResponse].
     * @author Cedric Delaruelle
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Moshi Json convertable data class used to wrap the response from a Post requests from the server.
     *
     * @property status A [String] with the return status ("OK" or "NOK")
     * @property reason If status "NOK": A [String] with the reason for the failed order
     * @constructor Creates a [ServerResponse].
     * @author Cedric Delaruelle
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Moshi Json convertable data class used to wrap the response from a Post requests from the server.
     *
     * @property status A [String] with the return status ("OK" or "NOK")
     * @property reason If status "NOK": A [String] with the reason for the failed order
     * @constructor Creates a [ServerResponse].
     * @author Cedric Delaruelle
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}