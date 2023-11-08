package com.akshar.maditationapp.ui.theme

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Path
import kotlin.math.abs


fun Path.standardQuadFromTo(form: Offset, to: Offset) {
    quadraticBezierTo(
        form.x,
        form.y,
        abs(form.x + to.x) / 2,
        abs(form.y + to.y) / 2
    )
}