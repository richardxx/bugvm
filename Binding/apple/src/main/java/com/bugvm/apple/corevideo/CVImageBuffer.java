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
package com.bugvm.apple.corevideo;

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
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.opengles.*;
import com.bugvm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreVideo")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CVImageBuffer/*</name>*/ 
    extends /*<extends>*/CVBuffer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(CVImageBuffer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /**
     * @since Available in iOS 4.0 and later.
     */
    public void setAttribute(CVImageBufferAttribute attribute, CFType value, CVAttachmentMode attachmentMode) {
        setAttachment(attribute.value(), value, attachmentMode);
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CFType getAttribute(CVImageBufferAttribute attribute) {
        return getAttachment(attribute.value());
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CVAttachmentMode getAttributeMode(CVImageBufferAttribute attribute) {
        return getAttachmentMode(attribute.value());
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public void removeAttribute(CVImageBufferAttribute attribute) {
        removeAttachment(attribute.value());
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public void removeAllAttributes() {
        removeAllAttachments();
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public CVImageBufferAttributes getAttributes(CVAttachmentMode attachmentMode) {
        return new CVImageBufferAttributes(getAttachments(attachmentMode).as(CFDictionary.class));
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @SuppressWarnings("unchecked")
    public void setAttributes(CVImageBufferAttributes attributes, CVAttachmentMode attachmentMode) {
        setAttachments(attributes.getDictionary().as(NSDictionary.class), attachmentMode);
    }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public void propagateAttributes(CVImageBuffer destinationBuffer) {
        propagateAttachments(destinationBuffer);
    }
    /*<methods>*/
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="CVImageBufferGetEncodedSize", optional=true)
    public native @ByVal CGSize getEncodedSize();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="CVImageBufferGetDisplaySize", optional=true)
    public native @ByVal CGSize getDisplaySize();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="CVImageBufferGetCleanRect", optional=true)
    public native @ByVal CGRect getCleanRect();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="CVImageBufferIsFlipped", optional=true)
    public native boolean isFlipped();
    /*</methods>*/
}
