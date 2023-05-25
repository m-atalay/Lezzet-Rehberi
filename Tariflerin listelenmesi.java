public List<Recipe> getAllRecipes() {
    List<Recipe> recipeList = new ArrayList<>();

    SQLiteDatabase db = this.getReadableDatabase();

    String selectQuery = "SELECT * FROM " + TABLE_RECIPES;

    Cursor cursor = db.rawQuery(selectQuery, null);

    if (cursor.moveToFirst()) {
        do {
            Recipe recipe = new Recipe();
            recipe.setId(cursor.getInt(cursor.getColumnIndex(COLUMN_RECIPE_ID)));
            recipe.setName(cursor.getString(cursor.getColumnIndex(COLUMN_RECIPE_NAME)));
            recipe.setCategory(cursor.getString(cursor.getColumnIndex(COLUMN_RECIPE_CATEGORY)));
            recipe.setIngredients(cursor.getString(cursor.getColumnIndex(COLUMN_RECIPE_INGREDIENTS)));
            recipe.setInstructions(cursor.getString(cursor.getColumnIndex(COLUMN_RECIPE_INSTRUCTIONS)));
            recipe.setServings(cursor.getInt(cursor.getColumnIndex(COLUMN_RECIPE_SERVINGS)));
            recipe.setCookTime(cursor.getInt(cursor.getColumnIndex(COLUMN_RECIPE_COOK_TIME)));
            recipe.setImage(cursor.getString(cursor.getColumnIndex(COLUMN_RECIPE_IMAGE)));
            recipeList.add(recipe);
        } while (cursor.moveToNext());
    }

    cursor.close();
    db.close();

    return recipeList;
}
