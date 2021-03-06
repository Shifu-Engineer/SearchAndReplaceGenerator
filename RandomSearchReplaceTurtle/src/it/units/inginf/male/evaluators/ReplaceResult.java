/*
 * Copyright (C) 2018 Machine Learning Lab - University of Trieste, 
 * Italy (http://machinelearning.inginf.units.it/)  
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */package it.units.inginf.male.evaluators;

import it.units.inginf.male.inputs.Bounds;

/**
 * Created by andrea on 29/11/16.
 */
public class ReplaceResult {
    private String replacedString;
    private Bounds bounds;

    public ReplaceResult(String replacedString, int start, int end) {
        this.replacedString = replacedString;
        bounds = new Bounds(start, end);
    }

    public String getReplacedString() {
        return replacedString;
    }

    public long length() {
        return replacedString.length() + 8;
    }

    public Bounds getBounds() {
        return bounds;
    }
}
