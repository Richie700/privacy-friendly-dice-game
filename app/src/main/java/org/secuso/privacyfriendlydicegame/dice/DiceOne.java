/*
 This file is part of Privacy Friendly Dice Game.

 Privacy Friendly PDice Game is free software:
 you can redistribute it and/or modify it under the terms of the
 GNU General Public License as published by the Free Software Foundation,
 either version 3 of the License, or any later version.

 Privacy Friendly Dice Game is distributed in the hope
 that it will be useful, but WITHOUT ANY WARRANTY; without even
 the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 See the GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with Privacy Friendly Dice Game. If not, see <http://www.gnu.org/licenses/>.
 */

package org.secuso.privacyfriendlydicegame.dice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * @author Karola Marky
 */

public class DiceOne extends View{

    Paint paint;
    View diceButton;
    float radius;

    public DiceOne(Context context, View diceButton, float dotWidth) {
        super(context);

        this.diceButton = diceButton;
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.WHITE);
        this.radius = dotWidth;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int buttonCenterX = diceButton.getLeft() + diceButton.getWidth()/2;
        int buttonCenterY = diceButton.getTop() + diceButton.getHeight()/2;

        canvas.drawCircle(buttonCenterX, buttonCenterY, radius, paint);
    }

}


