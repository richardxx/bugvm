/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bugvm.apple.avfoundation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import com.bugvm.objc.*;
import com.bugvm.objc.annotation.*;
import com.bugvm.objc.block.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
import com.bugvm.apple.foundation.*;
import com.bugvm.apple.corefoundation.*;
import com.bugvm.apple.dispatch.*;
import com.bugvm.apple.coreanimation.*;
import com.bugvm.apple.coreimage.*;
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.coreaudio.*;
import com.bugvm.apple.coremedia.*;
import com.bugvm.apple.corevideo.*;
import com.bugvm.apple.mediatoolbox.*;
import com.bugvm.apple.audiotoolbox.*;
import com.bugvm.apple.audiounit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 4.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVPlayerItemAccessLogEvent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVPlayerItemAccessLogEventPtr extends Ptr<AVPlayerItemAccessLogEvent, AVPlayerItemAccessLogEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVPlayerItemAccessLogEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVPlayerItemAccessLogEvent() {}
    protected AVPlayerItemAccessLogEvent(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 4.3 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Property(selector = "numberOfSegmentsDownloaded")
    public native @MachineSizedSInt long getNumberOfSegmentsDownloaded();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Property(selector = "numberOfMediaRequests")
    public native @MachineSizedSInt long getNumberOfMediaRequests();
    @Property(selector = "playbackStartDate")
    public native NSDate getPlaybackStartDate();
    @Property(selector = "URI")
    public native String getURI();
    @Property(selector = "serverAddress")
    public native String getServerAddress();
    @Property(selector = "numberOfServerAddressChanges")
    public native @MachineSizedSInt long getNumberOfServerAddressChanges();
    @Property(selector = "playbackSessionID")
    public native String getPlaybackSessionID();
    @Property(selector = "playbackStartOffset")
    public native double getPlaybackStartOffset();
    @Property(selector = "segmentsDownloadedDuration")
    public native double getSegmentsDownloadedDuration();
    @Property(selector = "durationWatched")
    public native double getDurationWatched();
    @Property(selector = "numberOfStalls")
    public native @MachineSizedSInt long getNumberOfStalls();
    @Property(selector = "numberOfBytesTransferred")
    public native long getNumberOfBytesTransferred();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "transferDuration")
    public native double getTransferDuration();
    @Property(selector = "observedBitrate")
    public native double getObservedBitrate();
    @Property(selector = "indicatedBitrate")
    public native double getIndicatedBitrate();
    @Property(selector = "numberOfDroppedVideoFrames")
    public native @MachineSizedSInt long getNumberOfDroppedVideoFrames();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "startupTime")
    public native double getStartupTime();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "downloadOverdue")
    public native @MachineSizedSInt long getDownloadOverdue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "observedMaxBitrate")
    public native double getObservedMaxBitrate();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "observedMinBitrate")
    public native double getObservedMinBitrate();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "observedBitrateStandardDeviation")
    public native double getObservedBitrateStandardDeviation();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "playbackType")
    public native String getPlaybackType();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "mediaRequestsWWAN")
    public native @MachineSizedSInt long getMediaRequestsWWAN();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "switchBitrate")
    public native double getSwitchBitrate();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
