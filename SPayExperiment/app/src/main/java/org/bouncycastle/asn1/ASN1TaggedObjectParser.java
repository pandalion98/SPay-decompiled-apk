/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package org.bouncycastle.asn1;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.InMemoryRepresentable;

public interface ASN1TaggedObjectParser
extends ASN1Encodable,
InMemoryRepresentable {
    public ASN1Encodable getObjectParser(int var1, boolean var2);

    public int getTagNo();
}
