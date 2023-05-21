package com.benonardo.nicertabbackround.mixin;

import net.minecraft.client.gui.widget.TabNavigationWidget;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(TabNavigationWidget.class)
public class TabNavigationWidgetMixin {

    @ModifyConstant(method = "render", constant = @Constant(intValue = -16777216))
    private int modifyTabBackgroundColor(int constant) {
        return 0x99000000;
    }

}
