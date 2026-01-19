package dev.dediamondpro.chatshot.util;

//? if <1.21.11 {
/*import net.minecraft.resources.ResourceLocation;
 *///?} else
import net.minecraft.resources.Identifier;

public class Textures {
    //? if >=1.21.0 {
    public static final /*? if <1.21.11 {*/ /*ResourceLocation *//*?} else {*/Identifier /*?}*/ COPY = /*? if <1.21.11 {*/ /*ResourceLocation *//*?} else {*/Identifier /*?}*/.fromNamespaceAndPath("chatshot", "copy.png");
    public static final /*? if <1.21.11 {*/ /*ResourceLocation *//*?} else {*/Identifier /*?}*/ SCREENSHOT = /*? if <1.21.11 {*/ /*ResourceLocation *//*?} else {*/Identifier /*?}*/.fromNamespaceAndPath("chatshot", "screenshot.png");
    //?} else {
    /*public static final ResourceLocation COPY = new ResourceLocation("chatshot", "copy.png");
    public static final ResourceLocation SCREENSHOT = new ResourceLocation("chatshot", "screenshot.png");
    *///?}
}
