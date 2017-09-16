/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class tracker_alert extends torrent_alert {
  private transient long swigCPtr;

  protected tracker_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.tracker_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(tracker_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_tracker_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public String message() {
    return libtorrent_jni.tracker_alert_message(swigCPtr, this);
  }

  public String tracker_url() {
    return libtorrent_jni.tracker_alert_tracker_url(swigCPtr, this);
  }

  public tcp_endpoint get_local_endpoint() {
    return new tcp_endpoint(libtorrent_jni.tracker_alert_get_local_endpoint(swigCPtr, this), true);
  }

}
