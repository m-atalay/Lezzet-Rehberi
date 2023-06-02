public void addInstruction(int recipeId, String instruction) {
    SQLiteDatabase db = this.getWritableDatabase();

    ContentValues values = new ContentValues();
    values.put(COLUMN_RECIPE_ID, recipeId);
    values.put(COLUMN_INSTRUCTION_STEP, instruction);

    db.insert(TABLE_INSTRUCTIONS, null, values);
    db.close();
}
