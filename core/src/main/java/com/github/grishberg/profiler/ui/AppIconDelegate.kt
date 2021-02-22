package com.github.grishberg.profiler.ui

import java.awt.Frame
import javax.swing.JLabel

interface AppIconDelegate {
    fun updateFrameIcon(frame: Frame)

    fun updateLoadingIcon(label: JLabel)
}
