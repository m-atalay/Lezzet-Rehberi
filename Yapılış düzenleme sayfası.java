public void updateInstruction(int instructionId, String newInstruction) {
    SQLiteDatabase db = this.getWritableDatabase();

    ContentValues values = new ContentValues();
    values.put(COLUMN_INSTRUCTION_STEP, newInstruction);

    db.update(TABLE_INSTRUCTIONS, values, COLUMN_INSTRUCTION_ID + " = ?", new String[]{String.valueOf(instructionId)});
    db.close();
}
