// Generated by delombok at Sat May 06 22:12:38 IST 2017
package org.example.domain;

import java.util.Date;

public class Greeting {
  private String message;
  private Date time;

  @java.beans.ConstructorProperties({"message", "time"})
  @java.lang.SuppressWarnings("all")
  @javax.annotation.Generated("lombok")
  public Greeting(final String message, final Date time) {
    this.message = message;
    this.time = time;
  }

  @java.lang.SuppressWarnings("all")
  @javax.annotation.Generated("lombok")
  public String getMessage() {
    return this.message;
  }

  @java.lang.SuppressWarnings("all")
  @javax.annotation.Generated("lombok")
  public Date getTime() {
    return this.time;
  }

  @java.lang.SuppressWarnings("all")
  @javax.annotation.Generated("lombok")
  public void setMessage(final String message) {
    this.message = message;
  }

  @java.lang.SuppressWarnings("all")
  @javax.annotation.Generated("lombok")
  public void setTime(final Date time) {
    this.time = time;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  @javax.annotation.Generated("lombok")
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof Greeting)) return false;
    final Greeting other = (Greeting) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    final java.lang.Object this$message = this.getMessage();
    final java.lang.Object other$message = other.getMessage();
    if (this$message == null ? other$message != null : !this$message.equals(other$message)) return false;
    final java.lang.Object this$time = this.getTime();
    final java.lang.Object other$time = other.getTime();
    if (this$time == null ? other$time != null : !this$time.equals(other$time)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  @javax.annotation.Generated("lombok")
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof Greeting;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  @javax.annotation.Generated("lombok")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final java.lang.Object $message = this.getMessage();
    result = result * PRIME + ($message == null ? 43 : $message.hashCode());
    final java.lang.Object $time = this.getTime();
    result = result * PRIME + ($time == null ? 43 : $time.hashCode());
    return result;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  @javax.annotation.Generated("lombok")
  public java.lang.String toString() {
    return "Greeting(message=" + this.getMessage() + ", time=" + this.getTime() + ")";
  }
}
