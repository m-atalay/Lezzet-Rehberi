public void addRecipe(Recipe recipe) {
    SQLiteDatabase db = this.getWritableDatabase();

    ContentValues values = new ContentValues();
    values.put(COLUMN_RECIPE_NAME, recipe.getName());
    values.put(COLUMN_RECIPE_CATEGORY, recipe.getCategory());
    values.put(COLUMN_RECIPE_INGREDIENTS, recipe.getIngredients());
    values.put(COLUMN_RECIPE_INSTRUCTIONS, recipe.getInstructions());
    values.put(COLUMN_RECIPE_SERVINGS, recipe.getServings());
    values.put(COLUMN_RECIPE_COOK_TIME, recipe.getCookTime());
    values.put(COLUMN_RECIPE_IMAGE, recipe.getImage());

    db.insert(TABLE_RECIPES, null, values);
    db.close();
}
