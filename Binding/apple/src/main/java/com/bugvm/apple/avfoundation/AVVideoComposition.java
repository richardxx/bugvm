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
 * @since Available in iOS 4.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVVideoComposition/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVVideoCompositionPtr extends Ptr<AVVideoComposition, AVVideoCompositionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVVideoComposition.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVVideoComposition() {}
    protected AVVideoComposition(long handle) { super(handle); }
    protected AVVideoComposition(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 6.0 and later.
     */
    public AVVideoComposition(AVAsset asset) { super(create(asset)); retain(getHandle()); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    public AVVideoComposition(AVAsset asset, @Block VoidBlock1<AVAsynchronousCIImageFilteringRequest> ciFiltersApplier) { super(create(asset, ciFiltersApplier)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "customVideoCompositorClass")
    public native Class<? extends AVVideoCompositing> getCustomVideoCompositorClass();
    @Property(selector = "frameDuration")
    public native @ByVal CMTime getFrameDuration();
    @Property(selector = "renderSize")
    public native @ByVal CGSize getRenderSize();
    @Property(selector = "renderScale")
    public native float getRenderScale();
    @Property(selector = "instructions")
    public native NSArray<AVVideoCompositionInstruction> getInstructions();
    @Property(selector = "animationTool")
    public native AVVideoCompositionCoreAnimationTool getAnimationTool();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Method(selector = "videoCompositionWithPropertiesOfAsset:")
    protected static native @Pointer long create(AVAsset asset);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "videoCompositionWithAsset:applyingCIFiltersWithHandler:")
    protected static native @Pointer long create(AVAsset asset, @Block VoidBlock1<AVAsynchronousCIImageFilteringRequest> ciFiltersApplier);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Method(selector = "isValidForAsset:timeRange:validationDelegate:")
    public native boolean isValid(AVAsset asset, @ByVal CMTimeRange timeRange, AVVideoCompositionValidationHandling validationDelegate);
    /*</methods>*/
}
